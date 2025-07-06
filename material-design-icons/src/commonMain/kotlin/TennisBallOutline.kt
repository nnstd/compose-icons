package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TennisBallOutline: ImageVector
    get() {
        if (_TennisBallOutline != null) {
            return _TennisBallOutline!!
        }
        _TennisBallOutline = ImageVector.Builder(
            name = "TennisBallOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.17f, 2.76f)
                curveTo(9.39f, 2.26f, 10.69f, 2f, 12f, 2f)
                curveTo(13.31f, 2f, 14.61f, 2.26f, 15.83f, 2.76f)
                curveTo(17.04f, 3.26f, 18.14f, 4f, 19.07f, 4.93f)
                curveTo(20f, 5.86f, 20.74f, 6.96f, 21.24f, 8.17f)
                curveTo(21.74f, 9.39f, 22f, 10.69f, 22f, 12f)
                curveTo(22f, 14.65f, 20.95f, 17.2f, 19.07f, 19.07f)
                curveTo(17.2f, 20.95f, 14.65f, 22f, 12f, 22f)
                curveTo(10.69f, 22f, 9.39f, 21.74f, 8.17f, 21.24f)
                curveTo(6.96f, 20.74f, 5.86f, 20f, 4.93f, 19.07f)
                curveTo(3.05f, 17.2f, 2f, 14.65f, 2f, 12f)
                curveTo(2f, 9.35f, 3.05f, 6.8f, 4.93f, 4.93f)
                curveTo(5.86f, 4f, 6.96f, 3.26f, 8.17f, 2.76f)
                moveTo(6.89f, 18.15f)
                curveTo(8.32f, 19.34f, 10.12f, 20f, 12f, 20f)
                curveTo(13.88f, 20f, 15.68f, 19.34f, 17.11f, 18.15f)
                curveTo(15.79f, 16.46f, 15f, 14.32f, 15f, 12f)
                curveTo(15f, 9.68f, 15.79f, 7.55f, 17.11f, 5.85f)
                curveTo(15.69f, 4.66f, 13.88f, 4f, 12f, 4f)
                curveTo(10.12f, 4f, 8.32f, 4.66f, 6.89f, 5.85f)
                curveTo(8.21f, 7.55f, 9f, 9.68f, 9f, 12f)
                curveTo(9f, 14.32f, 8.21f, 16.46f, 6.89f, 18.15f)
                moveTo(5.5f, 16.67f)
                curveTo(6.44f, 15.35f, 7f, 13.74f, 7f, 12f)
                curveTo(7f, 10.26f, 6.44f, 8.65f, 5.5f, 7.34f)
                curveTo(4.53f, 8.69f, 4f, 10.32f, 4f, 12f)
                curveTo(4f, 13.68f, 4.53f, 15.31f, 5.5f, 16.67f)
                moveTo(18.5f, 7.34f)
                curveTo(17.56f, 8.65f, 17f, 10.26f, 17f, 12f)
                curveTo(17f, 13.74f, 17.56f, 15.35f, 18.5f, 16.67f)
                curveTo(19.47f, 15.31f, 20f, 13.69f, 20f, 12f)
                curveTo(20f, 10.32f, 19.47f, 8.69f, 18.5f, 7.34f)
                close()
            }
        }.build()

        return _TennisBallOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TennisBallOutline: ImageVector? = null
