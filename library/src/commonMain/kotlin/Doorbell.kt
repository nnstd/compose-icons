package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Doorbell: ImageVector
    get() {
        if (_Doorbell != null) {
            return _Doorbell!!
        }
        _Doorbell = ImageVector.Builder(
            name = "Doorbell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                curveTo(10.9f, 10f, 10f, 10.9f, 10f, 12f)
                reflectiveCurveTo(10.9f, 14f, 12f, 14f)
                reflectiveCurveTo(14f, 13.1f, 14f, 12f)
                reflectiveCurveTo(13.1f, 10f, 12f, 10f)
                moveTo(16f, 2f)
                horizontalLineTo(8f)
                curveTo(6.9f, 2f, 6f, 2.9f, 6f, 4f)
                verticalLineTo(20f)
                curveTo(6f, 21.1f, 6.9f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(17.1f, 22f, 18f, 21.1f, 18f, 20f)
                verticalLineTo(4f)
                curveTo(18f, 2.9f, 17.1f, 2f, 16f, 2f)
                moveTo(16f, 20f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _Doorbell!!
    }

@Suppress("ObjectPropertyName")
private var _Doorbell: ImageVector? = null
