package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountBoxMinusOutline: ImageVector
    get() {
        if (_AccountBoxMinusOutline != null) {
            return _AccountBoxMinusOutline!!
        }
        _AccountBoxMinusOutline = ImageVector.Builder(
            name = "AccountBoxMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.4f, 14.15f)
                curveTo(12.73f, 14.95f, 12.26f, 15.93f, 12.08f, 17f)
                horizontalLineTo(7.5f)
                verticalLineTo(16.25f)
                curveTo(7.5f, 14.75f, 10.5f, 14f, 12f, 14f)
                curveTo(12.39f, 14f, 12.88f, 14.05f, 13.4f, 14.15f)
                moveTo(19f, 5f)
                verticalLineTo(12.08f)
                curveTo(19.72f, 12.2f, 20.39f, 12.45f, 21f, 12.8f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                curveTo(4.47f, 3f, 3.96f, 3.21f, 3.59f, 3.59f)
                curveTo(3.21f, 3.96f, 3f, 4.47f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 19.53f, 3.21f, 20.04f, 3.59f, 20.41f)
                curveTo(3.96f, 20.79f, 4.47f, 21f, 5f, 21f)
                horizontalLineTo(12.8f)
                curveTo(12.45f, 20.39f, 12.2f, 19.72f, 12.08f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                moveTo(12f, 12.25f)
                curveTo(12.6f, 12.25f, 13.17f, 12f, 13.59f, 11.59f)
                curveTo(14f, 11.17f, 14.25f, 10.6f, 14.25f, 10f)
                curveTo(14.25f, 9.4f, 14f, 8.83f, 13.59f, 8.41f)
                curveTo(13.17f, 8f, 12.6f, 7.75f, 12f, 7.75f)
                curveTo(11.4f, 7.75f, 10.83f, 8f, 10.41f, 8.41f)
                curveTo(10f, 8.83f, 9.75f, 9.4f, 9.75f, 10f)
                curveTo(9.75f, 10.6f, 10f, 11.17f, 10.41f, 11.59f)
                curveTo(10.83f, 12f, 11.4f, 12.25f, 12f, 12.25f)
                moveTo(22f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _AccountBoxMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountBoxMinusOutline: ImageVector? = null
