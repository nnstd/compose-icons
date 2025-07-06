package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SignatureText: ImageVector
    get() {
        if (_SignatureText != null) {
            return _SignatureText!!
        }
        _SignatureText = ImageVector.Builder(
            name = "SignatureText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                moveTo(6.2f, 17.3f)
                lineTo(4.8f, 15.9f)
                lineTo(6.2f, 14.5f)
                lineTo(5.5f, 13.8f)
                lineTo(4.1f, 15.2f)
                lineTo(2.7f, 13.8f)
                lineTo(2f, 14.5f)
                lineTo(3.4f, 15.9f)
                lineTo(2f, 17.3f)
                lineTo(2.7f, 18f)
                lineTo(4.1f, 16.6f)
                lineTo(5.5f, 18f)
                lineTo(6.2f, 17.3f)
                moveTo(20.5f, 3f)
                lineTo(21.7f, 7.4f)
                lineTo(20.7f, 7.7f)
                curveTo(20.2f, 6.8f, 19.8f, 6f, 19.3f, 5.5f)
                curveTo(18.7f, 5f, 18.1f, 5f, 17.5f, 5f)
                horizontalLineTo(15f)
                verticalLineTo(15.5f)
                curveTo(15f, 16f, 15f, 16.5f, 15.3f, 16.7f)
                curveTo(15.6f, 16.9f, 16.3f, 16.9f, 17f, 16.9f)
                verticalLineTo(17.9f)
                horizontalLineTo(11f)
                verticalLineTo(16.9f)
                curveTo(11.7f, 16.9f, 12.3f, 16.9f, 12.7f, 16.7f)
                curveTo(13f, 16.5f, 13f, 16f, 13f, 15.5f)
                verticalLineTo(5f)
                horizontalLineTo(10.5f)
                curveTo(9.9f, 5f, 9.3f, 5f, 8.7f, 5.4f)
                curveTo(8.2f, 5.8f, 7.7f, 6.7f, 7.3f, 7.6f)
                lineTo(6.3f, 7.3f)
                lineTo(7.5f, 3f)
                horizontalLineTo(20.5f)
                close()
            }
        }.build()

        return _SignatureText!!
    }

@Suppress("ObjectPropertyName")
private var _SignatureText: ImageVector? = null
