package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbCfl: ImageVector
    get() {
        if (_LightbulbCfl != null) {
            return _LightbulbCfl!!
        }
        _LightbulbCfl = ImageVector.Builder(
            name = "LightbulbCfl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 2f)
                curveTo(11.88f, 2f, 13f, 3.12f, 13f, 4.5f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(4.47f)
                curveTo(14f, 3.56f, 13.63f, 2.7f, 13f, 2.05f)
                curveTo(13.17f, 2f, 13.33f, 2f, 13.5f, 2f)
                curveTo(14.88f, 2f, 16f, 3.12f, 16f, 4.5f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                curveTo(17f, 17.55f, 16.55f, 18f, 16f, 18f)
                horizontalLineTo(8f)
                curveTo(7.45f, 18f, 7f, 17.55f, 7f, 17f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(4.5f)
                curveTo(8f, 3.12f, 9.12f, 2f, 10.5f, 2f)
                moveTo(10.5f, 4f)
                curveTo(10.22f, 4f, 10f, 4.22f, 10f, 4.5f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(4.5f)
                curveTo(11f, 4.22f, 10.78f, 4f, 10.5f, 4f)
                moveTo(9f, 20f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                curveTo(15f, 21.55f, 14.55f, 22f, 14f, 22f)
                horizontalLineTo(10f)
                curveTo(9.45f, 22f, 9f, 21.55f, 9f, 21f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _LightbulbCfl!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbCfl: ImageVector? = null
