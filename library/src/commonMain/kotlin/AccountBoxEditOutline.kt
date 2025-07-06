package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountBoxEditOutline: ImageVector
    get() {
        if (_AccountBoxEditOutline != null) {
            return _AccountBoxEditOutline!!
        }
        _AccountBoxEditOutline = ImageVector.Builder(
            name = "AccountBoxEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.7f, 13.58f)
                lineTo(20.42f, 12.3f)
                curveTo(20.21f, 12.09f, 19.86f, 12.09f, 19.65f, 12.3f)
                lineTo(18.65f, 13.3f)
                lineTo(20.7f, 15.35f)
                lineTo(21.7f, 14.35f)
                curveTo(21.91f, 14.14f, 21.91f, 13.79f, 21.7f, 13.58f)
                moveTo(12f, 22f)
                horizontalLineTo(14.06f)
                lineTo(20.11f, 15.93f)
                lineTo(18.06f, 13.88f)
                lineTo(12f, 19.94f)
                verticalLineTo(22f)
                moveTo(10f, 21f)
                horizontalLineTo(5f)
                curveTo(4.47f, 21f, 3.96f, 20.79f, 3.59f, 20.41f)
                curveTo(3.21f, 20.04f, 3f, 19.53f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 4.47f, 3.21f, 3.96f, 3.59f, 3.59f)
                curveTo(3.96f, 3.21f, 4.47f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.89f, 21f, 5f)
                verticalLineTo(10.33f)
                curveTo(20.36f, 10.07f, 19.63f, 10.08f, 19f, 10.36f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(10.11f)
                lineTo(10f, 19.11f)
                verticalLineTo(21f)
                moveTo(14.62f, 14.5f)
                lineTo(12.11f, 17f)
                horizontalLineTo(7.5f)
                verticalLineTo(16.25f)
                curveTo(7.5f, 14.75f, 10.5f, 14f, 12f, 14f)
                curveTo(12.7f, 14f, 13.73f, 14.16f, 14.62f, 14.5f)
                moveTo(13.59f, 11.59f)
                curveTo(13.17f, 12f, 12.6f, 12.25f, 12f, 12.25f)
                curveTo(11.4f, 12.25f, 10.83f, 12f, 10.41f, 11.59f)
                curveTo(10f, 11.17f, 9.75f, 10.6f, 9.75f, 10f)
                curveTo(9.75f, 9.4f, 10f, 8.83f, 10.41f, 8.41f)
                curveTo(10.83f, 8f, 11.4f, 7.75f, 12f, 7.75f)
                curveTo(12.6f, 7.75f, 13.17f, 8f, 13.59f, 8.41f)
                curveTo(14f, 8.83f, 14.25f, 9.4f, 14.25f, 10f)
                curveTo(14.25f, 10.6f, 14f, 11.17f, 13.59f, 11.59f)
                close()
            }
        }.build()

        return _AccountBoxEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountBoxEditOutline: ImageVector? = null
