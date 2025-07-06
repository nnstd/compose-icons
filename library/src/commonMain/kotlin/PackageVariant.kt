package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PackageVariant: ImageVector
    get() {
        if (_PackageVariant != null) {
            return _PackageVariant!!
        }
        _PackageVariant = ImageVector.Builder(
            name = "PackageVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 10.96f)
                curveTo(1.5f, 10.68f, 1.35f, 10.07f, 1.63f, 9.59f)
                lineTo(3.13f, 7f)
                curveTo(3.24f, 6.8f, 3.41f, 6.66f, 3.6f, 6.58f)
                lineTo(11.43f, 2.18f)
                curveTo(11.59f, 2.06f, 11.79f, 2f, 12f, 2f)
                curveTo(12.21f, 2f, 12.41f, 2.06f, 12.57f, 2.18f)
                lineTo(20.47f, 6.62f)
                curveTo(20.66f, 6.72f, 20.82f, 6.88f, 20.91f, 7.08f)
                lineTo(22.36f, 9.6f)
                curveTo(22.64f, 10.08f, 22.47f, 10.69f, 22f, 10.96f)
                lineTo(21f, 11.54f)
                verticalLineTo(16.5f)
                curveTo(21f, 16.88f, 20.79f, 17.21f, 20.47f, 17.38f)
                lineTo(12.57f, 21.82f)
                curveTo(12.41f, 21.94f, 12.21f, 22f, 12f, 22f)
                curveTo(11.79f, 22f, 11.59f, 21.94f, 11.43f, 21.82f)
                lineTo(3.53f, 17.38f)
                curveTo(3.21f, 17.21f, 3f, 16.88f, 3f, 16.5f)
                verticalLineTo(10.96f)
                curveTo(2.7f, 11.13f, 2.32f, 11.14f, 2f, 10.96f)
                moveTo(12f, 4.15f)
                verticalLineTo(4.15f)
                lineTo(12f, 10.85f)
                verticalLineTo(10.85f)
                lineTo(17.96f, 7.5f)
                lineTo(12f, 4.15f)
                moveTo(5f, 15.91f)
                lineTo(11f, 19.29f)
                verticalLineTo(12.58f)
                lineTo(5f, 9.21f)
                verticalLineTo(15.91f)
                moveTo(19f, 15.91f)
                verticalLineTo(12.69f)
                lineTo(14f, 15.59f)
                curveTo(13.67f, 15.77f, 13.3f, 15.76f, 13f, 15.6f)
                verticalLineTo(19.29f)
                lineTo(19f, 15.91f)
                moveTo(13.85f, 13.36f)
                lineTo(20.13f, 9.73f)
                lineTo(19.55f, 8.72f)
                lineTo(13.27f, 12.35f)
                lineTo(13.85f, 13.36f)
                close()
            }
        }.build()

        return _PackageVariant!!
    }

@Suppress("ObjectPropertyName")
private var _PackageVariant: ImageVector? = null
