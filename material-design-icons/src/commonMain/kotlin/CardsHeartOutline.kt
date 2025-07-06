package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardsHeartOutline: ImageVector
    get() {
        if (_CardsHeartOutline != null) {
            return _CardsHeartOutline!!
        }
        _CardsHeartOutline = ImageVector.Builder(
            name = "CardsHeartOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.1f, 18.55f)
                lineTo(12f, 18.65f)
                lineTo(11.89f, 18.55f)
                curveTo(7.14f, 14.24f, 4f, 11.39f, 4f, 8.5f)
                curveTo(4f, 6.5f, 5.5f, 5f, 7.5f, 5f)
                curveTo(9.04f, 5f, 10.54f, 6f, 11.07f, 7.36f)
                horizontalLineTo(12.93f)
                curveTo(13.46f, 6f, 14.96f, 5f, 16.5f, 5f)
                curveTo(18.5f, 5f, 20f, 6.5f, 20f, 8.5f)
                curveTo(20f, 11.39f, 16.86f, 14.24f, 12.1f, 18.55f)
                moveTo(16.5f, 3f)
                curveTo(14.76f, 3f, 13.09f, 3.81f, 12f, 5.08f)
                curveTo(10.91f, 3.81f, 9.24f, 3f, 7.5f, 3f)
                curveTo(4.42f, 3f, 2f, 5.41f, 2f, 8.5f)
                curveTo(2f, 12.27f, 5.4f, 15.36f, 10.55f, 20.03f)
                lineTo(12f, 21.35f)
                lineTo(13.45f, 20.03f)
                curveTo(18.6f, 15.36f, 22f, 12.27f, 22f, 8.5f)
                curveTo(22f, 5.41f, 19.58f, 3f, 16.5f, 3f)
                close()
            }
        }.build()

        return _CardsHeartOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardsHeartOutline: ImageVector? = null
