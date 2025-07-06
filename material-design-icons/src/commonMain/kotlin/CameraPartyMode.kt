package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraPartyMode: ImageVector
    get() {
        if (_CameraPartyMode != null) {
            return _CameraPartyMode!!
        }
        _CameraPartyMode = ImageVector.Builder(
            name = "CameraPartyMode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17f)
                curveTo(10.37f, 17f, 8.94f, 16.21f, 8f, 15f)
                horizontalLineTo(12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 12f)
                curveTo(15f, 11.65f, 14.93f, 11.31f, 14.82f, 11f)
                horizontalLineTo(16.9f)
                curveTo(16.96f, 11.32f, 17f, 11.66f, 17f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 17f)
                moveTo(12f, 7f)
                curveTo(13.63f, 7f, 15.06f, 7.79f, 16f, 9f)
                horizontalLineTo(12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
                curveTo(9f, 12.35f, 9.07f, 12.68f, 9.18f, 13f)
                horizontalLineTo(7.1f)
                curveTo(7.03f, 12.68f, 7f, 12.34f, 7f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7f)
                moveTo(20f, 4f)
                horizontalLineTo(16.83f)
                lineTo(15f, 2f)
                horizontalLineTo(9f)
                lineTo(7.17f, 4f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.1f, 4f, 20f, 4f)
                close()
            }
        }.build()

        return _CameraPartyMode!!
    }

@Suppress("ObjectPropertyName")
private var _CameraPartyMode: ImageVector? = null
