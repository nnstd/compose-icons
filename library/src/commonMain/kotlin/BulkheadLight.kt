package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BulkheadLight: ImageVector
    get() {
        if (_BulkheadLight != null) {
            return _BulkheadLight!!
        }
        _BulkheadLight = ImageVector.Builder(
            name = "BulkheadLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2.09f)
                curveTo(13f, 2.06f, 13f, 2.03f, 13f, 2f)
                curveTo(13f, 1.45f, 12.55f, 1f, 12f, 1f)
                reflectiveCurveTo(11f, 1.45f, 11f, 2f)
                curveTo(11f, 2.03f, 11f, 2.06f, 11f, 2.09f)
                curveTo(8.19f, 2.56f, 6.03f, 5f, 6.03f, 7.97f)
                verticalLineTo(16f)
                curveTo(6.03f, 19f, 8.19f, 21.44f, 11f, 21.91f)
                curveTo(11f, 21.94f, 11f, 21.97f, 11f, 22f)
                curveTo(11f, 22.55f, 11.45f, 23f, 12f, 23f)
                reflectiveCurveTo(13f, 22.55f, 13f, 22f)
                curveTo(13f, 21.97f, 13f, 21.94f, 13f, 21.91f)
                curveTo(15.81f, 21.44f, 17.97f, 19f, 17.97f, 16f)
                verticalLineTo(7.97f)
                curveTo(18f, 5f, 15.81f, 2.56f, 13f, 2.09f)
                moveTo(16f, 8f)
                horizontalLineTo(15f)
                verticalLineTo(5.4f)
                curveTo(15.6f, 6.09f, 16f, 7f, 16f, 8f)
                verticalLineTo(8f)
                moveTo(14f, 19.44f)
                curveTo(13.41f, 19.79f, 12.73f, 20f, 12f, 20f)
                curveTo(11.27f, 20f, 10.59f, 19.79f, 10f, 19.44f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(19.44f)
                moveTo(10f, 15f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                moveTo(9f, 15f)
                horizontalLineTo(8.03f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                moveTo(10f, 4.56f)
                curveTo(10.59f, 4.21f, 11.27f, 4f, 12f, 4f)
                curveTo(12.73f, 4f, 13.41f, 4.21f, 14f, 4.56f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(4.56f)
                moveTo(15f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                moveTo(9f, 5.4f)
                verticalLineTo(8f)
                horizontalLineTo(8.03f)
                verticalLineTo(7.97f)
                curveTo(8.03f, 7f, 8.4f, 6.09f, 9f, 5.4f)
                moveTo(8.03f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(18.6f)
                curveTo(8.4f, 17.91f, 8.03f, 17f, 8.03f, 16.03f)
                verticalLineTo(16f)
                moveTo(15f, 18.6f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                curveTo(16f, 17f, 15.6f, 17.91f, 15f, 18.6f)
                close()
            }
        }.build()

        return _BulkheadLight!!
    }

@Suppress("ObjectPropertyName")
private var _BulkheadLight: ImageVector? = null
