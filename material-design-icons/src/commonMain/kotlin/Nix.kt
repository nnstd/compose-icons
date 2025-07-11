package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Nix: ImageVector
    get() {
        if (_Nix != null) {
            return _Nix!!
        }
        _Nix = ImageVector.Builder(
            name = "Nix",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.9f, 8.7f)
                lineTo(5f, 17.2f)
                lineTo(3.9f, 15.3f)
                lineTo(5.2f, 13f)
                horizontalLineTo(2.6f)
                lineTo(2f, 12f)
                lineTo(2.6f, 11f)
                horizontalLineTo(6.3f)
                lineTo(7.6f, 8.7f)
                horizontalLineTo(9.9f)
                moveTo(10.2f, 15.5f)
                horizontalLineTo(19.9f)
                lineTo(18.8f, 17.4f)
                horizontalLineTo(16.2f)
                lineTo(17.5f, 19.7f)
                lineTo(16.9f, 20.7f)
                horizontalLineTo(15.8f)
                lineTo(14f, 17.4f)
                horizontalLineTo(11.3f)
                lineTo(10.2f, 15.5f)
                moveTo(15.9f, 11.8f)
                lineTo(11f, 3.3f)
                horizontalLineTo(13.2f)
                lineTo(14.5f, 5.6f)
                lineTo(15.8f, 3.3f)
                horizontalLineTo(16.9f)
                lineTo(17.5f, 4.3f)
                lineTo(15.6f, 7.5f)
                lineTo(17f, 9.8f)
                lineTo(15.9f, 11.8f)
                moveTo(13.8f, 8.5f)
                horizontalLineTo(4f)
                lineTo(5.1f, 6.6f)
                horizontalLineTo(7.7f)
                lineTo(6.4f, 4.3f)
                lineTo(7f, 3.3f)
                horizontalLineTo(8.1f)
                lineTo(10f, 6.5f)
                horizontalLineTo(12.7f)
                lineTo(13.8f, 8.5f)
                moveTo(14.1f, 15.3f)
                lineTo(19f, 6.8f)
                lineTo(20.1f, 8.7f)
                lineTo(18.8f, 11f)
                horizontalLineTo(21.4f)
                lineTo(22f, 12f)
                lineTo(21.4f, 13f)
                horizontalLineTo(17.7f)
                lineTo(16.4f, 15.3f)
                horizontalLineTo(14.1f)
                moveTo(8.1f, 12.2f)
                lineTo(13f, 20.6f)
                horizontalLineTo(10.8f)
                lineTo(9.5f, 18.3f)
                lineTo(8.4f, 20.6f)
                horizontalLineTo(7.1f)
                lineTo(6.5f, 19.6f)
                lineTo(8.4f, 16.4f)
                lineTo(7f, 14.2f)
                lineTo(8.1f, 12.2f)
                close()
            }
        }.build()

        return _Nix!!
    }

@Suppress("ObjectPropertyName")
private var _Nix: ImageVector? = null
