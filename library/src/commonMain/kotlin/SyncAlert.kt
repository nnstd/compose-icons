package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SyncAlert: ImageVector
    get() {
        if (_SyncAlert != null) {
            return _SyncAlert!!
        }
        _SyncAlert = ImageVector.Builder(
            name = "SyncAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                moveTo(21f, 4f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                lineTo(17.24f, 7.76f)
                curveTo(18.32f, 8.85f, 19f, 10.34f, 19f, 12f)
                curveTo(19f, 14.61f, 17.33f, 16.83f, 15f, 17.65f)
                verticalLineTo(19.74f)
                curveTo(18.45f, 18.85f, 21f, 15.73f, 21f, 12f)
                curveTo(21f, 9.79f, 20.09f, 7.8f, 18.64f, 6.36f)
                moveTo(11f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                moveTo(3f, 12f)
                curveTo(3f, 14.21f, 3.91f, 16.2f, 5.36f, 17.64f)
                lineTo(3f, 20f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                lineTo(6.76f, 16.24f)
                curveTo(5.68f, 15.15f, 5f, 13.66f, 5f, 12f)
                curveTo(5f, 9.39f, 6.67f, 7.17f, 9f, 6.35f)
                verticalLineTo(4.26f)
                curveTo(5.55f, 5.15f, 3f, 8.27f, 3f, 12f)
                close()
            }
        }.build()

        return _SyncAlert!!
    }

@Suppress("ObjectPropertyName")
private var _SyncAlert: ImageVector? = null
