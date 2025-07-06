package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeLightbulbOutline: ImageVector
    get() {
        if (_HomeLightbulbOutline != null) {
            return _HomeLightbulbOutline!!
        }
        _HomeLightbulbOutline = ImageVector.Builder(
            name = "HomeLightbulbOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 20f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                lineTo(12f, 3f)
                lineTo(22f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                moveTo(12f, 5.69f)
                lineTo(7f, 10.19f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(10.19f)
                lineTo(12f, 5.69f)
                moveTo(11f, 17f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                moveTo(11f, 15f)
                curveTo(10.72f, 15f, 10.5f, 14.78f, 10.5f, 14.5f)
                verticalLineTo(13.6f)
                curveTo(9.6f, 13.08f, 9f, 12.11f, 9f, 11f)
                curveTo(9f, 9.34f, 10.34f, 8f, 12f, 8f)
                curveTo(13.66f, 8f, 15f, 9.34f, 15f, 11f)
                curveTo(15f, 12.11f, 14.4f, 13.08f, 13.5f, 13.6f)
                verticalLineTo(14.5f)
                curveTo(13.5f, 14.78f, 13.28f, 15f, 13f, 15f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _HomeLightbulbOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HomeLightbulbOutline: ImageVector? = null
