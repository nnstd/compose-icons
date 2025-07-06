package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbCflSpiral: ImageVector
    get() {
        if (_LightbulbCflSpiral != null) {
            return _LightbulbCflSpiral!!
        }
        _LightbulbCflSpiral = ImageVector.Builder(
            name = "LightbulbCflSpiral",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 2f)
                curveTo(10.84f, 2f, 10.69f, 2.03f, 10.55f, 2.1f)
                lineTo(8.55f, 3.1f)
                curveTo(7.56f, 3.66f, 8f, 5f, 9f, 5f)
                curveTo(9.16f, 5f, 9.32f, 4.95f, 9.45f, 4.9f)
                lineTo(11.45f, 3.9f)
                curveTo(12.43f, 3.36f, 12f, 2f, 11f, 2f)
                moveTo(15f, 4f)
                curveTo(14.83f, 4f, 14.69f, 4.03f, 14.55f, 4.1f)
                lineTo(8.55f, 7.1f)
                curveTo(7.56f, 7.68f, 8f, 9f, 9f, 9f)
                curveTo(9.18f, 9f, 9.32f, 8.95f, 9.45f, 8.9f)
                lineTo(15.45f, 5.9f)
                curveTo(16.41f, 5.43f, 16f, 4f, 15f, 4f)
                moveTo(15f, 8f)
                curveTo(14.84f, 8f, 14.69f, 8.03f, 14.55f, 8.1f)
                lineTo(8.7f, 11.03f)
                curveTo(8.2f, 11.25f, 8f, 11.6f, 8f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                curveTo(7f, 17.55f, 7.44f, 18f, 8f, 18f)
                horizontalLineTo(16f)
                curveTo(16.55f, 18f, 17f, 17.55f, 17f, 17f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                curveTo(16f, 12.44f, 15.55f, 12f, 15f, 12f)
                curveTo(14.45f, 12f, 14f, 12.45f, 14f, 13f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(12.62f)
                lineTo(15.45f, 9.9f)
                curveTo(16.42f, 9.34f, 16f, 8f, 15f, 8f)
                moveTo(9f, 20f)
                verticalLineTo(21f)
                curveTo(9f, 21.57f, 9.46f, 22f, 10f, 22f)
                horizontalLineTo(14f)
                curveTo(14.56f, 22f, 15f, 21.55f, 15f, 21f)
                verticalLineTo(20f)
            }
        }.build()

        return _LightbulbCflSpiral!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbCflSpiral: ImageVector? = null
