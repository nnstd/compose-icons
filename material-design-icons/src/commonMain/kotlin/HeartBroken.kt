package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeartBroken: ImageVector
    get() {
        if (_HeartBroken != null) {
            return _HeartBroken!!
        }
        _HeartBroken = ImageVector.Builder(
            name = "HeartBroken",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21.35f)
                lineTo(10.55f, 20.03f)
                curveTo(5.4f, 15.36f, 2f, 12.27f, 2f, 8.5f)
                curveTo(2f, 5.41f, 4.42f, 3f, 7.5f, 3f)
                curveTo(8.17f, 3f, 8.82f, 3.12f, 9.44f, 3.33f)
                lineTo(13f, 9.35f)
                lineTo(9f, 14.35f)
                lineTo(12f, 21.35f)
                verticalLineTo(21.35f)
                moveTo(16.5f, 3f)
                curveTo(19.58f, 3f, 22f, 5.41f, 22f, 8.5f)
                curveTo(22f, 12.27f, 18.6f, 15.36f, 13.45f, 20.03f)
                lineTo(12f, 21.35f)
                lineTo(11f, 14.35f)
                lineTo(15.5f, 9.35f)
                lineTo(12.85f, 4.27f)
                curveTo(13.87f, 3.47f, 15.17f, 3f, 16.5f, 3f)
                close()
            }
        }.build()

        return _HeartBroken!!
    }

@Suppress("ObjectPropertyName")
private var _HeartBroken: ImageVector? = null
