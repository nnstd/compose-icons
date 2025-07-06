package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlashTriangle: ImageVector
    get() {
        if (_FlashTriangle != null) {
            return _FlashTriangle!!
        }
        _FlashTriangle = ImageVector.Builder(
            name = "FlashTriangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                lineTo(1f, 21f)
                horizontalLineTo(23f)
                lineTo(12f, 2f)
                moveTo(10f, 15f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                lineTo(12.5f, 13.5f)
                horizontalLineTo(14.5f)
                lineTo(11.5f, 19f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _FlashTriangle!!
    }

@Suppress("ObjectPropertyName")
private var _FlashTriangle: ImageVector? = null
