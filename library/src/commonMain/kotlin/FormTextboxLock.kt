package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormTextboxLock: ImageVector
    get() {
        if (_FormTextboxLock != null) {
            return _FormTextboxLock!!
        }
        _FormTextboxLock = ImageVector.Builder(
            name = "FormTextboxLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 7f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                moveTo(10f, 7f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
                curveTo(21.42f, 11.56f, 20.74f, 11.25f, 20f, 11.1f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(14.25f)
                curveTo(13.56f, 15f, 13f, 15.56f, 13f, 16.25f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                curveTo(10f, 19.55f, 10.45f, 20f, 11f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(10.5f)
                curveTo(9.95f, 22f, 9f, 21.55f, 9f, 21f)
                curveTo(9f, 21.55f, 8.05f, 22f, 7.5f, 22f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                curveTo(7.55f, 20f, 8f, 19.55f, 8f, 19f)
                verticalLineTo(5f)
                curveTo(8f, 4.45f, 7.55f, 4f, 7f, 4f)
                horizontalLineTo(5f)
                verticalLineTo(2f)
                horizontalLineTo(7.5f)
                curveTo(8.05f, 2f, 9f, 2.45f, 9f, 3f)
                curveTo(9f, 2.45f, 9.95f, 2f, 10.5f, 2f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                curveTo(10.45f, 4f, 10f, 4.45f, 10f, 5f)
                verticalLineTo(7f)
                moveTo(21.8f, 17f)
                curveTo(22.4f, 17f, 23f, 17.6f, 23f, 18.3f)
                verticalLineTo(21.8f)
                curveTo(23f, 22.4f, 22.4f, 23f, 21.7f, 23f)
                horizontalLineTo(16.2f)
                curveTo(15.6f, 23f, 15f, 22.4f, 15f, 21.7f)
                verticalLineTo(18.2f)
                curveTo(15f, 17.6f, 15.6f, 17f, 16.2f, 17f)
                verticalLineTo(15.5f)
                curveTo(16.2f, 14.1f, 17.6f, 13f, 19f, 13f)
                curveTo(20.4f, 13f, 21.8f, 14.1f, 21.8f, 15.5f)
                verticalLineTo(17f)
                moveTo(20.5f, 17f)
                verticalLineTo(15.5f)
                curveTo(20.5f, 14.7f, 19.8f, 14.2f, 19f, 14.2f)
                curveTo(18.2f, 14.2f, 17.5f, 14.7f, 17.5f, 15.5f)
                verticalLineTo(17f)
                horizontalLineTo(20.5f)
                close()
            }
        }.build()

        return _FormTextboxLock!!
    }

@Suppress("ObjectPropertyName")
private var _FormTextboxLock: ImageVector? = null
