package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlashAuto: ImageVector
    get() {
        if (_FlashAuto != null) {
            return _FlashAuto!!
        }
        _FlashAuto = ImageVector.Builder(
            name = "FlashAuto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.85f, 7.65f)
                lineTo(18f, 4f)
                lineTo(19.15f, 7.65f)
                moveTo(19f, 2f)
                horizontalLineTo(17f)
                lineTo(13.8f, 11f)
                horizontalLineTo(15.7f)
                lineTo(16.4f, 9f)
                horizontalLineTo(19.6f)
                lineTo(20.3f, 11f)
                horizontalLineTo(22.2f)
                moveTo(3f, 2f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(23f)
                lineTo(13f, 11f)
                horizontalLineTo(9f)
                lineTo(13f, 2f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _FlashAuto!!
    }

@Suppress("ObjectPropertyName")
private var _FlashAuto: ImageVector? = null
