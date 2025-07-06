package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseOff: ImageVector
    get() {
        if (_DatabaseOff != null) {
            return _DatabaseOff!!
        }
        _DatabaseOff = ImageVector.Builder(
            name = "DatabaseOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.07f, 15.87f)
                curveTo(19.66f, 15.31f, 20f, 14.68f, 20f, 14f)
                verticalLineTo(16.8f)
                lineTo(19.07f, 15.87f)
                moveTo(20f, 9f)
                curveTo(20f, 10.54f, 18.27f, 11.86f, 15.73f, 12.53f)
                lineTo(17.89f, 14.69f)
                curveTo(19.19f, 14f, 20f, 13.04f, 20f, 12f)
                verticalLineTo(9f)
                moveTo(20f, 7f)
                curveTo(20f, 4.79f, 16.42f, 3f, 12f, 3f)
                curveTo(10.13f, 3f, 8.42f, 3.33f, 7.06f, 3.86f)
                lineTo(14.06f, 10.86f)
                curveTo(17.5f, 10.41f, 20f, 8.85f, 20f, 7f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(4.21f, 6.1f)
                curveTo(4.08f, 6.39f, 4f, 6.69f, 4f, 7f)
                curveTo(4f, 8.63f, 5.96f, 10.04f, 8.77f, 10.66f)
                lineTo(11.08f, 12.97f)
                curveTo(7.1f, 12.74f, 4f, 11.06f, 4f, 9f)
                verticalLineTo(12f)
                curveTo(4f, 14.21f, 7.58f, 16f, 12f, 16f)
                curveTo(12.69f, 16f, 13.35f, 15.95f, 14f, 15.87f)
                lineTo(15.66f, 17.55f)
                curveTo(14.57f, 17.84f, 13.32f, 18f, 12f, 18f)
                curveTo(7.58f, 18f, 4f, 16.21f, 4f, 14f)
                verticalLineTo(17f)
                curveTo(4f, 19.21f, 7.58f, 21f, 12f, 21f)
                curveTo(14.31f, 21f, 16.38f, 20.5f, 17.84f, 19.73f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                close()
            }
        }.build()

        return _DatabaseOff!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseOff: ImageVector? = null
