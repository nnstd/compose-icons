package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GenderMaleFemale: ImageVector
    get() {
        if (_GenderMaleFemale != null) {
            return _GenderMaleFemale!!
        }
        _GenderMaleFemale = ImageVector.Builder(
            name = "GenderMaleFemale",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.58f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(2f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(5.41f)
                lineTo(15.17f, 9.24f)
                curveTo(15.69f, 10.03f, 16f, 11f, 16f, 12f)
                curveTo(16f, 14.42f, 14.28f, 16.44f, 12f, 16.9f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(21f)
                horizontalLineTo(12f)
                verticalLineTo(23f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                verticalLineTo(16.9f)
                curveTo(7.72f, 16.44f, 6f, 14.42f, 6f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 7f)
                curveTo(12f, 7f, 12.96f, 7.3f, 13.75f, 7.83f)
                lineTo(17.58f, 4f)
                moveTo(11f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 9f)
                close()
            }
        }.build()

        return _GenderMaleFemale!!
    }

@Suppress("ObjectPropertyName")
private var _GenderMaleFemale: ImageVector? = null
