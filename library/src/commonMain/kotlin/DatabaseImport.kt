package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseImport: ImageVector
    get() {
        if (_DatabaseImport != null) {
            return _DatabaseImport!!
        }
        _DatabaseImport = ImageVector.Builder(
            name = "DatabaseImport",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(8.59f, 3f, 5.69f, 4.07f, 4.54f, 5.57f)
                lineTo(9.79f, 10.82f)
                curveTo(10.5f, 10.93f, 11.22f, 11f, 12f, 11f)
                curveTo(16.42f, 11f, 20f, 9.21f, 20f, 7f)
                curveTo(20f, 4.79f, 16.42f, 3f, 12f, 3f)
                moveTo(3.92f, 7.08f)
                lineTo(2.5f, 8.5f)
                lineTo(5f, 11f)
                horizontalLineTo(0f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                lineTo(2.5f, 15.5f)
                lineTo(3.92f, 16.92f)
                lineTo(8.84f, 12f)
                moveTo(20f, 9f)
                curveTo(20f, 11.21f, 16.42f, 13f, 12f, 13f)
                curveTo(11.34f, 13f, 10.7f, 12.95f, 10.09f, 12.87f)
                lineTo(7.62f, 15.34f)
                curveTo(8.88f, 15.75f, 10.38f, 16f, 12f, 16f)
                curveTo(16.42f, 16f, 20f, 14.21f, 20f, 12f)
                moveTo(20f, 14f)
                curveTo(20f, 16.21f, 16.42f, 18f, 12f, 18f)
                curveTo(9.72f, 18f, 7.67f, 17.5f, 6.21f, 16.75f)
                lineTo(4.53f, 18.43f)
                curveTo(5.68f, 19.93f, 8.59f, 21f, 12f, 21f)
                curveTo(16.42f, 21f, 20f, 19.21f, 20f, 17f)
            }
        }.build()

        return _DatabaseImport!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseImport: ImageVector? = null
