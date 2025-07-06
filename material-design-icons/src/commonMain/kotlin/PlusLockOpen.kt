package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlusLockOpen: ImageVector
    get() {
        if (_PlusLockOpen != null) {
            return _PlusLockOpen!!
        }
        _PlusLockOpen = ImageVector.Builder(
            name = "PlusLockOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 5f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                moveTo(19f, 15f)
                curveTo(17.95f, 15f, 16.9f, 15.8f, 16.9f, 16.82f)
                verticalLineTo(18.64f)
                curveTo(16.45f, 18.64f, 16f, 19.07f, 16f, 19.5f)
                verticalLineTo(22.05f)
                curveTo(16f, 22.56f, 16.45f, 23f, 16.9f, 23f)
                horizontalLineTo(21.03f)
                curveTo(21.55f, 23f, 22f, 22.56f, 22f, 22.13f)
                verticalLineTo(19.58f)
                curveTo(22f, 19.07f, 21.55f, 18.64f, 21.1f, 18.64f)
                horizontalLineTo(17.88f)
                verticalLineTo(16.82f)
                curveTo(17.88f, 16.24f, 18.4f, 15.87f, 19f, 15.87f)
                reflectiveCurveTo(20.13f, 16.24f, 20.13f, 16.82f)
                verticalLineTo(17.18f)
                horizontalLineTo(21.1f)
                verticalLineTo(16.82f)
                curveTo(21.1f, 15.8f, 20.05f, 15f, 19f, 15f)
                close()
            }
        }.build()

        return _PlusLockOpen!!
    }

@Suppress("ObjectPropertyName")
private var _PlusLockOpen: ImageVector? = null
