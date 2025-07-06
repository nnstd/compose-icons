package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeartSettings: ImageVector
    get() {
        if (_HeartSettings != null) {
            return _HeartSettings!!
        }
        _HeartSettings = ImageVector.Builder(
            name = "HeartSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 22f)
                horizontalLineTo(17f)
                verticalLineTo(24f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                moveTo(11f, 24f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(24f)
                moveTo(7f, 24f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(24f)
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

        return _HeartSettings!!
    }

@Suppress("ObjectPropertyName")
private var _HeartSettings: ImageVector? = null
