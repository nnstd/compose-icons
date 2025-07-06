package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrackLight: ImageVector
    get() {
        if (_TrackLight != null) {
            return _TrackLight!!
        }
        _TrackLight = ImageVector.Builder(
            name = "TrackLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 1f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineTo(6.4f)
                lineTo(4.11f, 4.38f)
                lineTo(1.43f, 10.84f)
                lineTo(6.97f, 13.14f)
                lineTo(11.94f, 16.82f)
                lineTo(13.79f, 17.59f)
                lineTo(17.62f, 8.35f)
                lineTo(15.77f, 7.58f)
                lineTo(11f, 6.87f)
                verticalLineTo(3f)
                horizontalLineTo(14f)
                verticalLineTo(1f)
                horizontalLineTo(6f)
                moveTo(21.81f, 6.29f)
                lineTo(19.5f, 7.25f)
                lineTo(20.26f, 9.1f)
                lineTo(22.57f, 8.14f)
                lineTo(21.81f, 6.29f)
                moveTo(19.78f, 13.57f)
                lineTo(19f, 15.42f)
                lineTo(21.79f, 16.57f)
                lineTo(22.55f, 14.72f)
                lineTo(19.78f, 13.57f)
                moveTo(16.19f, 18.93f)
                lineTo(14.34f, 19.69f)
                lineTo(15.3f, 22f)
                lineTo(17.15f, 21.23f)
                lineTo(16.19f, 18.93f)
                close()
            }
        }.build()

        return _TrackLight!!
    }

@Suppress("ObjectPropertyName")
private var _TrackLight: ImageVector? = null
