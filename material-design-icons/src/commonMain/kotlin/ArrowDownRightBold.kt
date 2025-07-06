package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowDownRightBold: ImageVector
    get() {
        if (_ArrowDownRightBold != null) {
            return _ArrowDownRightBold!!
        }
        _ArrowDownRightBold = ImageVector.Builder(
            name = "ArrowDownRightBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 3f)
                curveTo(14.64f, 3f, 18f, 6.36f, 18f, 10.5f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                lineTo(16f, 20f)
                lineTo(10f, 13f)
                horizontalLineTo(14f)
                verticalLineTo(10.5f)
                curveTo(14f, 8.57f, 12.43f, 7f, 10.5f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(10.5f)
                close()
            }
        }.build()

        return _ArrowDownRightBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownRightBold: ImageVector? = null
