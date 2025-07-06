package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountConvertOutline: ImageVector
    get() {
        if (_AccountConvertOutline != null) {
            return _AccountConvertOutline!!
        }
        _AccountConvertOutline = ImageVector.Builder(
            name = "AccountConvertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                lineTo(11.34f, 0.03f)
                lineTo(15.15f, 3.84f)
                lineTo(16.5f, 2.5f)
                curveTo(19.75f, 4.07f, 22.09f, 7.24f, 22.45f, 11f)
                horizontalLineTo(23.95f)
                curveTo(23.44f, 4.84f, 18.29f, 0f, 12f, 0f)
                moveTo(12f, 4f)
                curveTo(10.07f, 4f, 8.5f, 5.57f, 8.5f, 7.5f)
                curveTo(8.5f, 9.43f, 10.07f, 11f, 12f, 11f)
                curveTo(13.93f, 11f, 15.5f, 9.43f, 15.5f, 7.5f)
                curveTo(15.5f, 5.57f, 13.93f, 4f, 12f, 4f)
                moveTo(12f, 6f)
                curveTo(12.83f, 6f, 13.5f, 6.67f, 13.5f, 7.5f)
                curveTo(13.5f, 8.33f, 12.83f, 9f, 12f, 9f)
                curveTo(11.17f, 9f, 10.5f, 8.33f, 10.5f, 7.5f)
                curveTo(10.5f, 6.67f, 11.17f, 6f, 12f, 6f)
                moveTo(0.05f, 13f)
                curveTo(0.56f, 19.16f, 5.71f, 24f, 12f, 24f)
                lineTo(12.66f, 23.97f)
                lineTo(8.85f, 20.16f)
                lineTo(7.5f, 21.5f)
                curveTo(4.25f, 19.94f, 1.91f, 16.76f, 1.55f, 13f)
                horizontalLineTo(0.05f)
                moveTo(12f, 13f)
                curveTo(8.13f, 13f, 5f, 14.57f, 5f, 16.5f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(16.5f)
                curveTo(19f, 14.57f, 15.87f, 13f, 12f, 13f)
                moveTo(12f, 15f)
                curveTo(14.11f, 15f, 15.61f, 15.53f, 16.39f, 16f)
                horizontalLineTo(7.61f)
                curveTo(8.39f, 15.53f, 9.89f, 15f, 12f, 15f)
                close()
            }
        }.build()

        return _AccountConvertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountConvertOutline: ImageVector? = null
