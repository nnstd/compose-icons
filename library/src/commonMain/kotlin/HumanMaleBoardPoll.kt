package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanMaleBoardPoll: ImageVector
    get() {
        if (_HumanMaleBoardPoll != null) {
            return _HumanMaleBoardPoll!!
        }
        _HumanMaleBoardPoll = ImageVector.Builder(
            name = "HumanMaleBoardPoll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 17f)
                curveTo(21.1f, 17f, 22f, 16.1f, 22f, 15f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                horizontalLineTo(9.5f)
                curveTo(9.8f, 2.6f, 10f, 3.3f, 10f, 4f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                moveTo(15f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                verticalLineTo(14f)
                horizontalLineTo(1.5f)
                verticalLineTo(9f)
                curveTo(1.5f, 7.9f, 2.4f, 7f, 3.5f, 7f)
                horizontalLineTo(15f)
                moveTo(8f, 4f)
                curveTo(8f, 5.1f, 7.1f, 6f, 6f, 6f)
                reflectiveCurveTo(4f, 5.1f, 4f, 4f)
                reflectiveCurveTo(4.9f, 2f, 6f, 2f)
                reflectiveCurveTo(8f, 2.9f, 8f, 4f)
                moveTo(17f, 6f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                moveTo(14f, 10f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                moveTo(11f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _HumanMaleBoardPoll!!
    }

@Suppress("ObjectPropertyName")
private var _HumanMaleBoardPoll: ImageVector? = null
