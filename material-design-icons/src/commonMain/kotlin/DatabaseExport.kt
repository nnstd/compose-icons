package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseExport: ImageVector
    get() {
        if (_DatabaseExport != null) {
            return _DatabaseExport!!
        }
        _DatabaseExport = ImageVector.Builder(
            name = "DatabaseExport",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(7.58f, 3f, 4f, 4.79f, 4f, 7f)
                curveTo(4f, 9.21f, 7.58f, 11f, 12f, 11f)
                curveTo(12.5f, 11f, 13f, 10.97f, 13.5f, 10.92f)
                verticalLineTo(9.5f)
                horizontalLineTo(16.39f)
                lineTo(15.39f, 8.5f)
                lineTo(18.9f, 5f)
                curveTo(17.5f, 3.8f, 14.94f, 3f, 12f, 3f)
                moveTo(18.92f, 7.08f)
                lineTo(17.5f, 8.5f)
                lineTo(20f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                lineTo(17.5f, 15.5f)
                lineTo(18.92f, 16.92f)
                lineTo(23.84f, 12f)
                moveTo(4f, 9f)
                verticalLineTo(12f)
                curveTo(4f, 14.21f, 7.58f, 16f, 12f, 16f)
                curveTo(13.17f, 16f, 14.26f, 15.85f, 15.25f, 15.63f)
                lineTo(16.38f, 14.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(12.92f)
                curveTo(13f, 12.97f, 12.5f, 13f, 12f, 13f)
                curveTo(7.58f, 13f, 4f, 11.21f, 4f, 9f)
                moveTo(4f, 14f)
                verticalLineTo(17f)
                curveTo(4f, 19.21f, 7.58f, 21f, 12f, 21f)
                curveTo(14.94f, 21f, 17.5f, 20.2f, 18.9f, 19f)
                lineTo(17f, 17.1f)
                curveTo(15.61f, 17.66f, 13.9f, 18f, 12f, 18f)
                curveTo(7.58f, 18f, 4f, 16.21f, 4f, 14f)
                close()
            }
        }.build()

        return _DatabaseExport!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseExport: ImageVector? = null
