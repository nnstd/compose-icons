package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowLeftBottomBold: ImageVector
    get() {
        if (_ArrowLeftBottomBold != null) {
            return _ArrowLeftBottomBold!!
        }
        _ArrowLeftBottomBold = ImageVector.Builder(
            name = "ArrowLeftBottomBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 10.5f)
                curveTo(21f, 14.64f, 17.64f, 18f, 13.5f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                lineTo(4f, 16f)
                lineTo(11f, 10f)
                verticalLineTo(14f)
                horizontalLineTo(13.5f)
                curveTo(15.43f, 14f, 17f, 12.43f, 17f, 10.5f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()

        return _ArrowLeftBottomBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftBottomBold: ImageVector? = null
