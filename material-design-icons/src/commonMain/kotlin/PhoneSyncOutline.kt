package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneSyncOutline: ImageVector
    get() {
        if (_PhoneSyncOutline != null) {
            return _PhoneSyncOutline!!
        }
        _PhoneSyncOutline = ImageVector.Builder(
            name = "PhoneSyncOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 15.5f)
                curveTo(18.8f, 15.5f, 17.5f, 15.3f, 16.4f, 14.9f)
                horizontalLineTo(16.1f)
                curveTo(15.8f, 14.9f, 15.6f, 15f, 15.4f, 15.2f)
                lineTo(13.2f, 17.4f)
                curveTo(10.4f, 15.9f, 8f, 13.6f, 6.6f, 10.8f)
                lineTo(8.8f, 8.6f)
                curveTo(9.1f, 8.3f, 9.2f, 7.9f, 9f, 7.6f)
                curveTo(8.7f, 6.5f, 8.5f, 5.2f, 8.5f, 4f)
                curveTo(8.5f, 3.5f, 8f, 3f, 7.5f, 3f)
                horizontalLineTo(4f)
                curveTo(3.5f, 3f, 3f, 3.5f, 3f, 4f)
                curveTo(3f, 13.4f, 10.6f, 21f, 20f, 21f)
                curveTo(20.5f, 21f, 21f, 20.5f, 21f, 20f)
                verticalLineTo(16.5f)
                curveTo(21f, 16f, 20.5f, 15.5f, 20f, 15.5f)
                moveTo(5f, 5f)
                horizontalLineTo(6.5f)
                curveTo(6.6f, 5.9f, 6.8f, 6.8f, 7f, 7.6f)
                lineTo(5.8f, 8.8f)
                curveTo(5.4f, 7.6f, 5.1f, 6.3f, 5f, 5f)
                moveTo(19f, 19f)
                curveTo(17.7f, 18.9f, 16.4f, 18.6f, 15.2f, 18.2f)
                lineTo(16.4f, 17f)
                curveTo(17.2f, 17.2f, 18.1f, 17.4f, 19f, 17.4f)
                verticalLineTo(19f)
                moveTo(17f, 3f)
                verticalLineTo(1.5f)
                lineTo(14.75f, 3.75f)
                lineTo(17f, 6f)
                verticalLineTo(4.5f)
                curveTo(18.38f, 4.5f, 19.5f, 5.62f, 19.5f, 7f)
                curveTo(19.5f, 7.4f, 19.41f, 7.78f, 19.24f, 8.12f)
                lineTo(20.33f, 9.21f)
                curveTo(20.75f, 8.58f, 21f, 7.82f, 21f, 7f)
                curveTo(21f, 4.79f, 19.21f, 3f, 17f, 3f)
                moveTo(17f, 9.5f)
                curveTo(15.62f, 9.5f, 14.5f, 8.38f, 14.5f, 7f)
                curveTo(14.5f, 6.6f, 14.59f, 6.22f, 14.76f, 5.88f)
                lineTo(13.67f, 4.79f)
                curveTo(13.25f, 5.42f, 13f, 6.18f, 13f, 7f)
                curveTo(13f, 9.21f, 14.79f, 11f, 17f, 11f)
                verticalLineTo(12.5f)
                lineTo(19.25f, 10.25f)
                lineTo(17f, 8f)
                verticalLineTo(9.5f)
                close()
            }
        }.build()

        return _PhoneSyncOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneSyncOutline: ImageVector? = null
