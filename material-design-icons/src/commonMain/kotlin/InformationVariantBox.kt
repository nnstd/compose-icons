package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InformationVariantBox: ImageVector
    get() {
        if (_InformationVariantBox != null) {
            return _InformationVariantBox!!
        }
        _InformationVariantBox = ImageVector.Builder(
            name = "InformationVariantBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.89f, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 19.53f, 20.79f, 20.04f, 20.41f, 20.41f)
                curveTo(20.04f, 20.79f, 19.53f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(4.47f, 21f, 3.96f, 20.79f, 3.59f, 20.41f)
                curveTo(3.21f, 20.04f, 3f, 19.53f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.89f, 3f, 5f, 3f)
                moveTo(12.3f, 7.29f)
                curveTo(12.11f, 7.5f, 12f, 7.74f, 12f, 8f)
                curveTo(12f, 8.27f, 12.11f, 8.5f, 12.3f, 8.71f)
                curveTo(12.5f, 8.9f, 12.74f, 9f, 13f, 9f)
                curveTo(13.27f, 9f, 13.5f, 8.9f, 13.71f, 8.71f)
                curveTo(13.9f, 8.5f, 14f, 8.27f, 14f, 8f)
                curveTo(14f, 7.74f, 13.9f, 7.5f, 13.71f, 7.29f)
                curveTo(13.5f, 7.11f, 13.27f, 7f, 13f, 7f)
                curveTo(12.74f, 7f, 12.5f, 7.11f, 12.3f, 7.29f)
                moveTo(9.8f, 11.97f)
                curveTo(9.7f, 12.06f, 9.7f, 12.07f, 9.77f, 12.17f)
                lineTo(9.82f, 12.25f)
                lineTo(9.85f, 12.31f)
                curveTo(9.92f, 12.44f, 9.93f, 12.44f, 10.04f, 12.36f)
                curveTo(10.17f, 12.27f, 10.39f, 12.13f, 10.76f, 11.91f)
                curveTo(11.68f, 11.32f, 11.5f, 12f, 11.09f, 13.5f)
                curveTo(10.87f, 14.33f, 10.59f, 15.39f, 10.38f, 16.62f)
                curveTo(10.14f, 18.37f, 11.71f, 17.47f, 12.12f, 17.2f)
                curveTo(12.5f, 16.96f, 13.44f, 16.3f, 13.66f, 16.15f)
                lineTo(13.7f, 16.13f)
                curveTo(13.82f, 16.04f, 13.77f, 16f, 13.68f, 15.86f)
                lineTo(13.62f, 15.78f)
                curveTo(13.54f, 15.67f, 13.46f, 15.75f, 13.46f, 15.75f)
                lineTo(13.3f, 15.86f)
                curveTo(12.85f, 16.16f, 12.23f, 16.59f, 12.13f, 16.25f)
                curveTo(12.04f, 16f, 12.41f, 14.64f, 12.79f, 13.25f)
                curveTo(12.96f, 12.64f, 13.13f, 12f, 13.26f, 11.47f)
                lineTo(13.28f, 11.41f)
                curveTo(13.35f, 10.97f, 13.5f, 10.12f, 12.77f, 10.18f)
                curveTo(11.97f, 10.25f, 9.8f, 11.97f, 9.8f, 11.97f)
                close()
            }
        }.build()

        return _InformationVariantBox!!
    }

@Suppress("ObjectPropertyName")
private var _InformationVariantBox: ImageVector? = null
