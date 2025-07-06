package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Octahedron: ImageVector
    get() {
        if (_Octahedron != null) {
            return _Octahedron!!
        }
        _Octahedron = ImageVector.Builder(
            name = "Octahedron",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.7f, 11.29f)
                horizontalLineTo(21.71f)
                lineTo(12.71f, 2.29f)
                curveTo(12.5f, 2.1f, 12.26f, 2f, 12f, 2f)
                curveTo(11.74f, 2f, 11.5f, 2.1f, 11.29f, 2.29f)
                lineTo(2.29f, 11.29f)
                horizontalLineTo(2.3f)
                curveTo(1.91f, 11.68f, 1.91f, 12.32f, 2.3f, 12.71f)
                horizontalLineTo(2.29f)
                lineTo(11.29f, 21.71f)
                curveTo(11.5f, 21.9f, 11.74f, 22f, 12f, 22f)
                curveTo(12.26f, 22f, 12.5f, 21.9f, 12.71f, 21.71f)
                lineTo(21.71f, 12.71f)
                horizontalLineTo(21.7f)
                curveTo(22.09f, 12.32f, 22.09f, 11.68f, 21.7f, 11.29f)
                moveTo(13f, 8.28f)
                verticalLineTo(5.41f)
                lineTo(17.3f, 9.71f)
                lineTo(13f, 8.28f)
                moveTo(11f, 8.28f)
                lineTo(6.7f, 9.71f)
                lineTo(11f, 5.41f)
                verticalLineTo(8.28f)
                moveTo(12f, 10.05f)
                lineTo(17.84f, 12f)
                lineTo(12f, 13.95f)
                lineTo(6.16f, 12f)
                lineTo(12f, 10.05f)
                moveTo(11f, 15.72f)
                verticalLineTo(18.59f)
                lineTo(6.7f, 14.29f)
                lineTo(11f, 15.72f)
                moveTo(13f, 15.72f)
                lineTo(17.3f, 14.29f)
                lineTo(13f, 18.59f)
                verticalLineTo(15.72f)
                close()
            }
        }.build()

        return _Octahedron!!
    }

@Suppress("ObjectPropertyName")
private var _Octahedron: ImageVector? = null
