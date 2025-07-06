package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Scoreboard: ImageVector
    get() {
        if (_Scoreboard != null) {
            return _Scoreboard!!
        }
        _Scoreboard = ImageVector.Builder(
            name = "Scoreboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 9f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                moveTo(16f, 9f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                moveTo(21f, 3f)
                curveTo(22.1f, 3f, 23f, 3.9f, 23f, 5f)
                verticalLineTo(19f)
                curveTo(23f, 20.1f, 22.1f, 21f, 21f, 21f)
                horizontalLineTo(3f)
                curveTo(1.9f, 21f, 1f, 20.1f, 1f, 19f)
                verticalLineTo(5f)
                curveTo(1f, 3.9f, 1.9f, 3f, 3f, 3f)
                horizontalLineTo(21f)
                moveTo(5f, 7f)
                curveTo(4.4f, 7f, 4f, 7.4f, 4f, 8f)
                verticalLineTo(16f)
                curveTo(4f, 16.6f, 4.4f, 17f, 5f, 17f)
                horizontalLineTo(9f)
                curveTo(9.6f, 17f, 10f, 16.6f, 10f, 16f)
                verticalLineTo(8f)
                curveTo(10f, 7.4f, 9.6f, 7f, 9f, 7f)
                horizontalLineTo(5f)
                moveTo(15f, 7f)
                curveTo(14.4f, 7f, 14f, 7.4f, 14f, 8f)
                verticalLineTo(16f)
                curveTo(14f, 16.6f, 14.4f, 17f, 15f, 17f)
                horizontalLineTo(19f)
                curveTo(19.6f, 17f, 20f, 16.6f, 20f, 16f)
                verticalLineTo(8f)
                curveTo(20f, 7.4f, 19.6f, 7f, 19f, 7f)
                horizontalLineTo(15f)
                moveTo(12f, 11f)
                curveTo(12.6f, 11f, 13f, 10.6f, 13f, 10f)
                curveTo(13f, 9.4f, 12.6f, 9f, 12f, 9f)
                curveTo(11.4f, 9f, 11f, 9.4f, 11f, 10f)
                curveTo(11f, 10.6f, 11.4f, 11f, 12f, 11f)
                moveTo(12f, 15f)
                curveTo(12.6f, 15f, 13f, 14.6f, 13f, 14f)
                curveTo(13f, 13.4f, 12.6f, 13f, 12f, 13f)
                curveTo(11.4f, 13f, 11f, 13.4f, 11f, 14f)
                curveTo(11f, 14.6f, 11.4f, 15f, 12f, 15f)
                close()
            }
        }.build()

        return _Scoreboard!!
    }

@Suppress("ObjectPropertyName")
private var _Scoreboard: ImageVector? = null
