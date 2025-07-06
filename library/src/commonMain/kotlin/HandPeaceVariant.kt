package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandPeaceVariant: ImageVector
    get() {
        if (_HandPeaceVariant != null) {
            return _HandPeaceVariant!!
        }
        _HandPeaceVariant = ImageVector.Builder(
            name = "HandPeaceVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 19f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                moveTo(16.94f, 1f)
                curveTo(16.4f, 0.91f, 15.87f, 1.25f, 15.76f, 1.8f)
                lineTo(14.75f, 7.57f)
                curveTo(14.53f, 7.54f, 14.29f, 7.5f, 14f, 7.47f)
                lineTo(13.57f, 7.5f)
                lineTo(12.41f, 1.8f)
                curveTo(12.31f, 1.26f, 11.78f, 0.91f, 11.24f, 1f)
                curveTo(10.7f, 1.13f, 10.35f, 1.66f, 10.45f, 2.2f)
                lineTo(11.65f, 8.11f)
                lineTo(7.85f, 9.8f)
                curveTo(7.35f, 10f, 7f, 10.53f, 7f, 11.14f)
                verticalLineTo(15.5f)
                curveTo(7f, 16.3f, 7.73f, 17f, 8.5f, 17f)
                horizontalLineTo(15f)
                curveTo(15.39f, 17f, 15.74f, 16.84f, 16f, 16.57f)
                lineTo(16.5f, 16.16f)
                curveTo(16.5f, 16.16f, 17f, 15.78f, 17f, 15.36f)
                verticalLineTo(13f)
                curveTo(17f, 13f, 17f, 11.86f, 16.13f, 11.3f)
                lineTo(17.71f, 2.2f)
                curveTo(17.83f, 1.66f, 17.5f, 1.13f, 16.94f, 1f)
                close()
            }
        }.build()

        return _HandPeaceVariant!!
    }

@Suppress("ObjectPropertyName")
private var _HandPeaceVariant: ImageVector? = null
