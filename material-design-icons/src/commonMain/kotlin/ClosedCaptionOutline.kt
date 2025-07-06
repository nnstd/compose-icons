package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClosedCaptionOutline: ImageVector
    get() {
        if (_ClosedCaptionOutline != null) {
            return _ClosedCaptionOutline!!
        }
        _ClosedCaptionOutline = ImageVector.Builder(
            name = "ClosedCaptionOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 4f)
                curveTo(4.45f, 4f, 4f, 4.18f, 3.59f, 4.57f)
                curveTo(3.2f, 4.96f, 3f, 5.44f, 3f, 6f)
                verticalLineTo(18f)
                curveTo(3f, 18.56f, 3.2f, 19.04f, 3.59f, 19.43f)
                curveTo(4f, 19.82f, 4.45f, 20f, 5f, 20f)
                horizontalLineTo(19f)
                curveTo(19.5f, 20f, 20f, 19.81f, 20.39f, 19.41f)
                curveTo(20.8f, 19f, 21f, 18.53f, 21f, 18f)
                verticalLineTo(6f)
                curveTo(21f, 5.47f, 20.8f, 5f, 20.39f, 4.59f)
                curveTo(20f, 4.19f, 19.5f, 4f, 19f, 4f)
                horizontalLineTo(5f)
                moveTo(4.5f, 5.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(5.5f)
                moveTo(7f, 9f)
                curveTo(6.7f, 9f, 6.47f, 9.09f, 6.28f, 9.28f)
                curveTo(6.09f, 9.47f, 6f, 9.7f, 6f, 10f)
                verticalLineTo(14f)
                curveTo(6f, 14.3f, 6.09f, 14.53f, 6.28f, 14.72f)
                curveTo(6.47f, 14.91f, 6.7f, 15f, 7f, 15f)
                horizontalLineTo(10f)
                curveTo(10.27f, 15f, 10.5f, 14.91f, 10.71f, 14.72f)
                curveTo(10.91f, 14.53f, 11f, 14.3f, 11f, 14f)
                verticalLineTo(13f)
                horizontalLineTo(9.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                curveTo(11f, 9.7f, 10.91f, 9.47f, 10.71f, 9.28f)
                curveTo(10.5f, 9.09f, 10.27f, 9f, 10f, 9f)
                horizontalLineTo(7f)
                moveTo(14f, 9f)
                curveTo(13.73f, 9f, 13.5f, 9.09f, 13.29f, 9.28f)
                curveTo(13.09f, 9.47f, 13f, 9.7f, 13f, 10f)
                verticalLineTo(14f)
                curveTo(13f, 14.3f, 13.09f, 14.53f, 13.29f, 14.72f)
                curveTo(13.5f, 14.91f, 13.73f, 15f, 14f, 15f)
                horizontalLineTo(17f)
                curveTo(17.3f, 15f, 17.53f, 14.91f, 17.72f, 14.72f)
                curveTo(17.91f, 14.53f, 18f, 14.3f, 18f, 14f)
                verticalLineTo(13f)
                horizontalLineTo(16.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                curveTo(18f, 9.7f, 17.91f, 9.47f, 17.72f, 9.28f)
                curveTo(17.53f, 9.09f, 17.3f, 9f, 17f, 9f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _ClosedCaptionOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ClosedCaptionOutline: ImageVector? = null
