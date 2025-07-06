package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GenderMale: ImageVector
    get() {
        if (_GenderMale != null) {
            return _GenderMale!!
        }
        _GenderMale = ImageVector.Builder(
            name = "GenderMale",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 9f)
                curveTo(10.29f, 9f, 11.5f, 9.41f, 12.47f, 10.11f)
                lineTo(17.58f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineTo(6.41f)
                lineTo(13.89f, 11.5f)
                curveTo(14.59f, 12.5f, 15f, 13.7f, 15f, 15f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 21f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 15f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 9f)
                moveTo(9f, 11f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 15f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 19f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 15f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 11f)
                close()
            }
        }.build()

        return _GenderMale!!
    }

@Suppress("ObjectPropertyName")
private var _GenderMale: ImageVector? = null
