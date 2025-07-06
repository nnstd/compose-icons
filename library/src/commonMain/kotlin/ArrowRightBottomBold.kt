package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowRightBottomBold: ImageVector
    get() {
        if (_ArrowRightBottomBold != null) {
            return _ArrowRightBottomBold!!
        }
        _ArrowRightBottomBold = ImageVector.Builder(
            name = "ArrowRightBottomBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                horizontalLineTo(7f)
                verticalLineTo(10.5f)
                curveTo(7f, 12.43f, 8.57f, 14f, 10.5f, 14f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                lineTo(20f, 16f)
                lineTo(13f, 22f)
                verticalLineTo(18f)
                horizontalLineTo(10.5f)
                curveTo(6.36f, 18f, 3f, 14.64f, 3f, 10.5f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _ArrowRightBottomBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightBottomBold: ImageVector? = null
