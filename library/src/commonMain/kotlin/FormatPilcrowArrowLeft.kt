package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatPilcrowArrowLeft: ImageVector
    get() {
        if (_FormatPilcrowArrowLeft != null) {
            return _FormatPilcrowArrowLeft!!
        }
        _FormatPilcrowArrowLeft = ImageVector.Builder(
            name = "FormatPilcrowArrowLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 17f)
                verticalLineTo(14f)
                lineTo(4f, 18f)
                lineTo(8f, 22f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                moveTo(10f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                verticalLineTo(2f)
                horizontalLineTo(10f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 10f)
                close()
            }
        }.build()

        return _FormatPilcrowArrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _FormatPilcrowArrowLeft: ImageVector? = null
