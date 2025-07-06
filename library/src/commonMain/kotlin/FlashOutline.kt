package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlashOutline: ImageVector
    get() {
        if (_FlashOutline != null) {
            return _FlashOutline!!
        }
        _FlashOutline = ImageVector.Builder(
            name = "FlashOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                horizontalLineTo(17f)
                lineTo(13.5f, 9f)
                horizontalLineTo(17f)
                lineTo(10f, 22f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                moveTo(9f, 4f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                verticalLineTo(14.66f)
                lineTo(14f, 11f)
                horizontalLineTo(10.24f)
                lineTo(13.76f, 4f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _FlashOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FlashOutline: ImageVector? = null
