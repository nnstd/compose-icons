package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailCheck: ImageVector
    get() {
        if (_EmailCheck != null) {
            return _EmailCheck!!
        }
        _EmailCheck = ImageVector.Builder(
            name = "EmailCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 19f)
                curveTo(13f, 15.69f, 15.69f, 13f, 19f, 13f)
                curveTo(20.1f, 13f, 21.12f, 13.3f, 22f, 13.81f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.1f, 4f, 20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.89f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 19.67f, 13f, 19.34f, 13f, 19f)
                moveTo(4f, 8f)
                verticalLineTo(6f)
                lineTo(12f, 11f)
                lineTo(20f, 6f)
                verticalLineTo(8f)
                lineTo(12f, 13f)
                lineTo(4f, 8f)
                moveTo(17.75f, 22.16f)
                lineTo(15f, 19.16f)
                lineTo(16.16f, 18f)
                lineTo(17.75f, 19.59f)
                lineTo(21.34f, 16f)
                lineTo(22.5f, 17.41f)
                lineTo(17.75f, 22.16f)
            }
        }.build()

        return _EmailCheck!!
    }

@Suppress("ObjectPropertyName")
private var _EmailCheck: ImageVector? = null
