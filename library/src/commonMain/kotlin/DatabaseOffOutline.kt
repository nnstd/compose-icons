package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseOffOutline: ImageVector
    get() {
        if (_DatabaseOffOutline != null) {
            return _DatabaseOffOutline!!
        }
        _DatabaseOffOutline = ImageVector.Builder(
            name = "DatabaseOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(4.21f, 6.1f)
                curveTo(4.08f, 6.39f, 4f, 6.69f, 4f, 7f)
                verticalLineTo(17f)
                curveTo(4f, 19.21f, 7.59f, 21f, 12f, 21f)
                curveTo(14.3f, 21f, 16.38f, 20.5f, 17.84f, 19.73f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(6f, 9.64f)
                curveTo(6.76f, 10.07f, 7.7f, 10.42f, 8.76f, 10.65f)
                lineTo(12.11f, 14f)
                curveTo(12.07f, 14f, 12.04f, 14f, 12f, 14f)
                curveTo(9.58f, 14f, 7.3f, 13.4f, 6f, 12.45f)
                verticalLineTo(9.64f)
                moveTo(12f, 19f)
                curveTo(8.13f, 19f, 6f, 17.5f, 6f, 17f)
                verticalLineTo(14.77f)
                curveTo(7.61f, 15.55f, 9.72f, 16f, 12f, 16f)
                curveTo(12.68f, 16f, 13.34f, 15.95f, 14f, 15.87f)
                lineTo(16.34f, 18.23f)
                curveTo(15.33f, 18.65f, 13.87f, 19f, 12f, 19f)
                moveTo(8.64f, 5.44f)
                lineTo(7.06f, 3.86f)
                curveTo(8.42f, 3.33f, 10.13f, 3f, 12f, 3f)
                curveTo(16.42f, 3f, 20f, 4.79f, 20f, 7f)
                verticalLineTo(16.8f)
                lineTo(18f, 14.8f)
                verticalLineTo(14.77f)
                lineTo(18f, 14.78f)
                lineTo(16.45f, 13.25f)
                curveTo(17.05f, 13.03f, 17.58f, 12.76f, 18f, 12.45f)
                verticalLineTo(9.64f)
                curveTo(16.97f, 10.22f, 15.61f, 10.65f, 14.06f, 10.86f)
                lineTo(12.19f, 9f)
                curveTo(15.94f, 8.94f, 18f, 7.5f, 18f, 7f)
                curveTo(18f, 6.5f, 15.87f, 5f, 12f, 5f)
                curveTo(10.66f, 5f, 9.54f, 5.18f, 8.64f, 5.44f)
                close()
            }
        }.build()

        return _DatabaseOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseOffOutline: ImageVector? = null
