package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookHeartOutline: ImageVector
    get() {
        if (_BookHeartOutline != null) {
            return _BookHeartOutline!!
        }
        _BookHeartOutline = ImageVector.Builder(
            name = "BookHeartOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 23.3f)
                lineTo(18.4f, 22.8f)
                curveTo(16.4f, 20.9f, 15f, 19.7f, 15f, 18.2f)
                curveTo(15f, 17f, 16f, 16f, 17.2f, 16f)
                curveTo(17.9f, 16f, 18.6f, 16.3f, 19f, 16.8f)
                curveTo(19.4f, 16.3f, 20.1f, 16f, 20.8f, 16f)
                curveTo(22f, 16f, 23f, 16.9f, 23f, 18.2f)
                curveTo(23f, 19.7f, 21.6f, 20.9f, 19.6f, 22.8f)
                lineTo(19f, 23.3f)
                moveTo(18f, 2f)
                curveTo(19.1f, 2f, 20f, 2.9f, 20f, 4f)
                verticalLineTo(13.08f)
                lineTo(19f, 13f)
                lineTo(18f, 13.08f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                lineTo(10.5f, 9.75f)
                lineTo(8f, 12f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(13.08f)
                curveTo(13.2f, 20.72f, 13.45f, 21.39f, 13.8f, 22f)
                horizontalLineTo(6f)
                curveTo(4.9f, 22f, 4f, 21.1f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.9f, 4.9f, 2f, 6f, 2f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _BookHeartOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookHeartOutline: ImageVector? = null
