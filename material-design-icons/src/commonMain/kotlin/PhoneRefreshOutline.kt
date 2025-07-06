package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneRefreshOutline: ImageVector
    get() {
        if (_PhoneRefreshOutline != null) {
            return _PhoneRefreshOutline!!
        }
        _PhoneRefreshOutline = ImageVector.Builder(
            name = "PhoneRefreshOutline",
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
                moveTo(17f, 7f)
                lineTo(18.77f, 5.23f)
                curveTo(18.32f, 4.78f, 17.69f, 4.5f, 17f, 4.5f)
                curveTo(15.62f, 4.5f, 14.5f, 5.62f, 14.5f, 7f)
                reflectiveCurveTo(15.62f, 9.5f, 17f, 9.5f)
                curveTo(17.82f, 9.5f, 18.54f, 9.11f, 19f, 8.5f)
                horizontalLineTo(20.71f)
                curveTo(20.12f, 9.97f, 18.68f, 11f, 17f, 11f)
                curveTo(14.79f, 11f, 13f, 9.21f, 13f, 7f)
                reflectiveCurveTo(14.79f, 3f, 17f, 3f)
                curveTo(18.11f, 3f, 19.11f, 3.45f, 19.83f, 4.17f)
                lineTo(21f, 3f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _PhoneRefreshOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneRefreshOutline: ImageVector? = null
