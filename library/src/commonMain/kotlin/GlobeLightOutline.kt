package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GlobeLightOutline: ImageVector
    get() {
        if (_GlobeLightOutline != null) {
            return _GlobeLightOutline!!
        }
        _GlobeLightOutline = ImageVector.Builder(
            name = "GlobeLightOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 8.08f)
                verticalLineTo(2f)
                horizontalLineTo(11f)
                verticalLineTo(8.08f)
                curveTo(7.61f, 8.57f, 5f, 11.47f, 5f, 15f)
                curveTo(5f, 18.87f, 8.13f, 22f, 12f, 22f)
                reflectiveCurveTo(19f, 18.87f, 19f, 15f)
                curveTo(19f, 11.47f, 16.39f, 8.57f, 13f, 8.08f)
                moveTo(12f, 20f)
                curveTo(9.24f, 20f, 7f, 17.76f, 7f, 15f)
                curveTo(7f, 13.87f, 7.39f, 12.84f, 8.03f, 12f)
                horizontalLineTo(15.97f)
                curveTo(16.61f, 12.84f, 17f, 13.87f, 17f, 15f)
                curveTo(17f, 17.76f, 14.76f, 20f, 12f, 20f)
                close()
            }
        }.build()

        return _GlobeLightOutline!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeLightOutline: ImageVector? = null
