package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NatureOutline: ImageVector
    get() {
        if (_NatureOutline != null) {
            return _NatureOutline!!
        }
        _NatureOutline = ImageVector.Builder(
            name = "NatureOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.08f, 14.22f)
                lineTo(12.77f, 14.13f)
                curveTo(15.24f, 13.84f, 17.17f, 11.73f, 17.17f, 9.17f)
                curveTo(17.17f, 6.41f, 14.94f, 4.17f, 12.17f, 4.17f)
                curveTo(10.84f, 4.17f, 9.57f, 4.7f, 8.63f, 5.63f)
                curveTo(7.7f, 6.57f, 7.17f, 7.84f, 7.17f, 9.17f)
                curveTo(7.17f, 11.64f, 8.96f, 13.69f, 11.33f, 14.09f)
                lineTo(12.08f, 14.22f)
                moveTo(13f, 16.12f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(16.06f)
                curveTo(7.69f, 15.5f, 5.17f, 12.64f, 5.17f, 9.17f)
                curveTo(5.17f, 7.31f, 5.91f, 5.53f, 7.22f, 4.22f)
                curveTo(8.53f, 2.91f, 10.31f, 2.17f, 12.17f, 2.17f)
                curveTo(16.04f, 2.17f, 19.17f, 5.3f, 19.17f, 9.17f)
                curveTo(19.17f, 12.76f, 16.47f, 15.71f, 13f, 16.12f)
                close()
            }
        }.build()

        return _NatureOutline!!
    }

@Suppress("ObjectPropertyName")
private var _NatureOutline: ImageVector? = null
