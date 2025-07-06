package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeSearchOutline: ImageVector
    get() {
        if (_HomeSearchOutline != null) {
            return _HomeSearchOutline!!
        }
        _HomeSearchOutline = ImageVector.Builder(
            name = "HomeSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.31f, 18.9f)
                curveTo(19.75f, 18.21f, 20f, 17.38f, 20f, 16.5f)
                curveTo(20f, 14f, 18f, 12f, 15.5f, 12f)
                reflectiveCurveTo(11f, 14f, 11f, 16.5f)
                reflectiveCurveTo(13f, 21f, 15.5f, 21f)
                curveTo(16.37f, 21f, 17.19f, 20.75f, 17.88f, 20.32f)
                lineTo(21f, 23.39f)
                lineTo(22.39f, 22f)
                lineTo(19.31f, 18.9f)
                moveTo(15.5f, 19f)
                curveTo(14.12f, 19f, 13f, 17.88f, 13f, 16.5f)
                reflectiveCurveTo(14.12f, 14f, 15.5f, 14f)
                reflectiveCurveTo(18f, 15.12f, 18f, 16.5f)
                reflectiveCurveTo(16.88f, 19f, 15.5f, 19f)
                moveTo(5f, 20f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                lineTo(12f, 3f)
                lineTo(22f, 12f)
                horizontalLineTo(20.18f)
                curveTo(19.33f, 11.11f, 18.23f, 10.47f, 17f, 10.18f)
                lineTo(12f, 5.69f)
                lineTo(7f, 10.19f)
                verticalLineTo(18f)
                horizontalLineTo(9.18f)
                curveTo(9.35f, 18.72f, 9.64f, 19.39f, 10.03f, 20f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _HomeSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HomeSearchOutline: ImageVector? = null
