package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GenderFemale: ImageVector
    get() {
        if (_GenderFemale != null) {
            return _GenderFemale!!
        }
        _GenderFemale = ImageVector.Builder(
            name = "GenderFemale",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 10f)
                curveTo(18f, 12.97f, 15.84f, 15.44f, 13f, 15.92f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(15.92f)
                curveTo(8.16f, 15.44f, 6f, 12.97f, 6f, 10f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                moveTo(12f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 10f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 10f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                close()
            }
        }.build()

        return _GenderFemale!!
    }

@Suppress("ObjectPropertyName")
private var _GenderFemale: ImageVector? = null
