package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountChildOutline: ImageVector
    get() {
        if (_AccountChildOutline != null) {
            return _AccountChildOutline!!
        }
        _AccountChildOutline = ImageVector.Builder(
            name = "AccountChildOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17f)
                curveTo(10.9f, 17f, 10f, 16.1f, 10f, 15f)
                curveTo(10f, 13.9f, 10.9f, 13f, 12f, 13f)
                curveTo(13.1f, 13f, 14f, 13.9f, 14f, 15f)
                curveTo(14f, 16.1f, 13.1f, 17f, 12f, 17f)
                moveTo(12f, 10f)
                curveTo(14.34f, 10f, 19f, 11.16f, 19f, 13.5f)
                verticalLineTo(18.63f)
                curveTo(19f, 19.5f, 18.31f, 20.24f, 17.34f, 20.79f)
                verticalLineTo(13.38f)
                curveTo(17.34f, 12.82f, 14.6f, 11.54f, 12f, 11.54f)
                curveTo(9.4f, 11.54f, 6.66f, 12.82f, 6.66f, 13.38f)
                verticalLineTo(18.75f)
                curveTo(6.66f, 19f, 7.31f, 19.46f, 8.28f, 19.85f)
                curveTo(9f, 19f, 10.93f, 18.56f, 12f, 18.56f)
                curveTo(13.33f, 18.56f, 16f, 19.22f, 16f, 20.56f)
                verticalLineTo(21.39f)
                curveTo(14.63f, 21.88f, 13.07f, 22.13f, 12f, 22.13f)
                curveTo(10.93f, 22.13f, 9.38f, 21.88f, 8f, 21.39f)
                horizontalLineTo(8f)
                curveTo(6.37f, 20.81f, 5f, 19.89f, 5f, 18.63f)
                verticalLineTo(13.5f)
                curveTo(5f, 11.16f, 9.66f, 10f, 12f, 10f)
                moveTo(12f, 3.75f)
                curveTo(11.03f, 3.75f, 10.25f, 4.53f, 10.25f, 5.5f)
                curveTo(10.25f, 6.47f, 11.03f, 7.25f, 12f, 7.25f)
                curveTo(12.97f, 7.25f, 13.75f, 6.47f, 13.75f, 5.5f)
                curveTo(13.75f, 4.53f, 12.97f, 3.75f, 12f, 3.75f)
                moveTo(12f, 9f)
                curveTo(10.07f, 9f, 8.5f, 7.43f, 8.5f, 5.5f)
                curveTo(8.5f, 3.57f, 10.07f, 2f, 12f, 2f)
                curveTo(13.93f, 2f, 15.5f, 3.57f, 15.5f, 5.5f)
                curveTo(15.5f, 7.43f, 13.93f, 9f, 12f, 9f)
                close()
            }
        }.build()

        return _AccountChildOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountChildOutline: ImageVector? = null
