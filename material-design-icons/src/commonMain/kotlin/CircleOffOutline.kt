package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CircleOffOutline: ImageVector
    get() {
        if (_CircleOffOutline != null) {
            return _CircleOffOutline!!
        }
        _CircleOffOutline = ImageVector.Builder(
            name = "CircleOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(4.06f, 5.95f)
                curveTo(2.78f, 7.63f, 2f, 9.72f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                curveTo(14.28f, 22f, 16.37f, 21.23f, 18.05f, 19.94f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(12f, 20f)
                curveTo(7.58f, 20f, 4f, 16.42f, 4f, 12f)
                curveTo(4f, 10.27f, 4.56f, 8.68f, 5.5f, 7.38f)
                lineTo(16.62f, 18.5f)
                curveTo(15.32f, 19.45f, 13.73f, 20f, 12f, 20f)
                moveTo(8.17f, 4.97f)
                lineTo(6.72f, 3.5f)
                curveTo(8.25f, 2.56f, 10.06f, 2f, 12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                curveTo(22f, 13.94f, 21.44f, 15.75f, 20.5f, 17.28f)
                lineTo(19.03f, 15.83f)
                curveTo(19.65f, 14.69f, 20f, 13.39f, 20f, 12f)
                curveTo(20f, 7.58f, 16.42f, 4f, 12f, 4f)
                curveTo(10.61f, 4f, 9.31f, 4.35f, 8.17f, 4.97f)
                close()
            }
        }.build()

        return _CircleOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CircleOffOutline: ImageVector? = null
