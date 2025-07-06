package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableLock: ImageVector
    get() {
        if (_TableLock != null) {
            return _TableLock!!
        }
        _TableLock = ImageVector.Builder(
            name = "TableLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 16f)
                verticalLineTo(15.5f)
                curveTo(21f, 14.12f, 19.88f, 13f, 18.5f, 13f)
                reflectiveCurveTo(16f, 14.12f, 16f, 15.5f)
                verticalLineTo(16f)
                curveTo(15.45f, 16f, 15f, 16.45f, 15f, 17f)
                verticalLineTo(21f)
                curveTo(15f, 21.55f, 15.45f, 22f, 16f, 22f)
                horizontalLineTo(21f)
                curveTo(21.55f, 22f, 22f, 21.55f, 22f, 21f)
                verticalLineTo(17f)
                curveTo(22f, 16.45f, 21.55f, 16f, 21f, 16f)
                moveTo(20f, 16f)
                horizontalLineTo(17f)
                verticalLineTo(15.5f)
                curveTo(17f, 14.67f, 17.67f, 14f, 18.5f, 14f)
                reflectiveCurveTo(20f, 14.67f, 20f, 15.5f)
                verticalLineTo(16f)
                moveTo(13f, 18f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                horizontalLineTo(14.26f)
                curveTo(14.54f, 13.21f, 15.04f, 12.5f, 15.69f, 12f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(11.05f)
                curveTo(18.17f, 11.03f, 18.33f, 11f, 18.5f, 11f)
                curveTo(19.03f, 11f, 19.53f, 11.1f, 20f, 11.26f)
                verticalLineTo(6f)
                curveTo(20f, 4.89f, 19.11f, 4f, 18f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                moveTo(10f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                moveTo(10f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _TableLock!!
    }

@Suppress("ObjectPropertyName")
private var _TableLock: ImageVector? = null
