package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlusLock: ImageVector
    get() {
        if (_PlusLock != null) {
            return _PlusLock!!
        }
        _PlusLock = ImageVector.Builder(
            name = "PlusLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.14f, 17.67f)
                verticalLineTo(17.22f)
                curveTo(21.14f, 16f, 20.2f, 15f, 19f, 15f)
                reflectiveCurveTo(16.86f, 16f, 16.86f, 17.22f)
                verticalLineTo(17.67f)
                curveTo(16.34f, 17.67f, 16f, 18f, 16f, 18.56f)
                verticalLineTo(22.11f)
                curveTo(16f, 22.65f, 16.34f, 23f, 16.86f, 23f)
                horizontalLineTo(21.14f)
                curveTo(21.66f, 23f, 22f, 22.65f, 22f, 22.11f)
                verticalLineTo(18.55f)
                curveTo(22f, 18f, 21.66f, 17.67f, 21.14f, 17.67f)
                moveTo(20.29f, 17.67f)
                horizontalLineTo(17.72f)
                verticalLineTo(17.22f)
                curveTo(17.72f, 16.5f, 18.31f, 15.89f, 19f, 15.89f)
                curveTo(19.69f, 15.89f, 20.29f, 16.5f, 20.29f, 17.22f)
                verticalLineTo(17.67f)
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
                close()
            }
        }.build()

        return _PlusLock!!
    }

@Suppress("ObjectPropertyName")
private var _PlusLock: ImageVector? = null
