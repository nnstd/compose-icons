package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailSearchOutline: ImageVector
    get() {
        if (_EmailSearchOutline != null) {
            return _EmailSearchOutline!!
        }
        _EmailSearchOutline = ImageVector.Builder(
            name = "EmailSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 11f)
                curveTo(19f, 11f, 21f, 13f, 21f, 15.5f)
                curveTo(21f, 16.38f, 20.75f, 17.21f, 20.31f, 17.9f)
                lineTo(23.39f, 21f)
                lineTo(22f, 22.39f)
                lineTo(18.88f, 19.32f)
                curveTo(18.19f, 19.75f, 17.37f, 20f, 16.5f, 20f)
                curveTo(14f, 20f, 12f, 18f, 12f, 15.5f)
                reflectiveCurveTo(14f, 11f, 16.5f, 11f)
                moveTo(16.5f, 13f)
                curveTo(15.12f, 13f, 14f, 14.12f, 14f, 15.5f)
                reflectiveCurveTo(15.12f, 18f, 16.5f, 18f)
                reflectiveCurveTo(19f, 16.88f, 19f, 15.5f)
                reflectiveCurveTo(17.88f, 13f, 16.5f, 13f)
                moveTo(10.5f, 18f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                lineTo(10.62f, 12.76f)
                curveTo(11.65f, 10.54f, 13.9f, 9f, 16.5f, 9f)
                curveTo(16.77f, 9f, 17.04f, 9f, 17.31f, 9.06f)
                lineTo(19f, 8f)
                verticalLineTo(9.5f)
                curveTo(19.75f, 9.81f, 20.42f, 10.27f, 21f, 10.82f)
                verticalLineTo(6f)
                curveTo(21f, 4.9f, 20.1f, 4f, 19f, 4f)
                horizontalLineTo(3f)
                curveTo(1.9f, 4f, 1f, 4.9f, 1f, 6f)
                verticalLineTo(18f)
                curveTo(1f, 19.1f, 1.9f, 20f, 3f, 20f)
                horizontalLineTo(11.82f)
                curveTo(11.27f, 19.42f, 10.82f, 18.75f, 10.5f, 18f)
                moveTo(19f, 6f)
                lineTo(11f, 11f)
                lineTo(3f, 6f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _EmailSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmailSearchOutline: ImageVector? = null
