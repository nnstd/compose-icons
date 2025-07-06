package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowLeftRightBold: ImageVector
    get() {
        if (_ArrowLeftRightBold != null) {
            return _ArrowLeftRightBold!!
        }
        _ArrowLeftRightBold = ImageVector.Builder(
            name = "ArrowLeftRightBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 14f)
                verticalLineTo(18f)
                lineTo(2f, 12f)
                lineTo(8f, 6f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                lineTo(22f, 12f)
                lineTo(16f, 18f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _ArrowLeftRightBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftRightBold: ImageVector? = null
