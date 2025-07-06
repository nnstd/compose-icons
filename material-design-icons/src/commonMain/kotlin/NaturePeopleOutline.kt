package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NaturePeopleOutline: ImageVector
    get() {
        if (_NaturePeopleOutline != null) {
            return _NaturePeopleOutline!!
        }
        _NaturePeopleOutline = ImageVector.Builder(
            name = "NaturePeopleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 20f)
                verticalLineTo(16.12f)
                curveTo(19.47f, 15.71f, 22.17f, 12.76f, 22.17f, 9.17f)
                curveTo(22.17f, 5.3f, 19.04f, 2.17f, 15.17f, 2.17f)
                curveTo(13.31f, 2.17f, 11.53f, 2.91f, 10.22f, 4.22f)
                curveTo(8.91f, 5.53f, 8.17f, 7.31f, 8.17f, 9.17f)
                curveTo(8.17f, 9.95f, 8.3f, 10.69f, 8.53f, 11.38f)
                curveTo(8.64f, 11.71f, 8.77f, 12.03f, 8.93f, 12.33f)
                curveTo(9.91f, 14.27f, 11.78f, 15.68f, 14f, 16.06f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(12.95f)
                curveTo(7f, 12.72f, 6.89f, 12.5f, 6.74f, 12.33f)
                lineTo(6.71f, 12.29f)
                lineTo(6.66f, 12.25f)
                curveTo(6.5f, 12.09f, 6.25f, 12f, 6f, 12f)
                horizontalLineTo(3f)
                curveTo(2.76f, 12f, 2.5f, 12.09f, 2.34f, 12.25f)
                lineTo(2.29f, 12.29f)
                curveTo(2.11f, 12.5f, 2f, 12.74f, 2f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                moveTo(15.08f, 14.22f)
                lineTo(14.33f, 14.09f)
                curveTo(11.96f, 13.69f, 10.17f, 11.64f, 10.17f, 9.17f)
                curveTo(10.17f, 7.84f, 10.7f, 6.57f, 11.63f, 5.63f)
                curveTo(12.57f, 4.7f, 13.85f, 4.17f, 15.17f, 4.17f)
                curveTo(17.93f, 4.17f, 20.17f, 6.41f, 20.17f, 9.17f)
                curveTo(20.17f, 11.73f, 18.24f, 13.84f, 15.77f, 14.13f)
                lineTo(15.08f, 14.21f)
                moveTo(4.5f, 11f)
                curveTo(5.33f, 11f, 6f, 10.33f, 6f, 9.5f)
                curveTo(6f, 8.67f, 5.33f, 8f, 4.5f, 8f)
                curveTo(3.67f, 8f, 3f, 8.67f, 3f, 9.5f)
                curveTo(3f, 10.33f, 3.67f, 11f, 4.5f, 11f)
                close()
            }
        }.build()

        return _NaturePeopleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _NaturePeopleOutline: ImageVector? = null
