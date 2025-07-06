package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatPilcrowArrowRight: ImageVector
    get() {
        if (_FormatPilcrowArrowRight != null) {
            return _FormatPilcrowArrowRight!!
        }
        _FormatPilcrowArrowRight = ImageVector.Builder(
            name = "FormatPilcrowArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 18f)
                lineTo(17f, 14f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                moveTo(9f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 10f)
                close()
            }
        }.build()

        return _FormatPilcrowArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _FormatPilcrowArrowRight: ImageVector? = null
